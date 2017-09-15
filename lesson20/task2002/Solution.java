package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();
        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            DataOutputStream dOS = new DataOutputStream(outputStream);
            dOS.writeInt(users.size());
            for (User user : users) {
                boolean flag;
                dOS.writeBoolean(flag = user.getFirstName() != null);
                if (flag) dOS.writeUTF(user.getFirstName());
                dOS.writeBoolean(flag = user.getLastName() != null);
                if (flag) dOS.writeUTF(user.getLastName());
                dOS.writeBoolean(flag = user.getBirthDate() != null);
                if (flag) dOS.writeLong(user.getBirthDate().getTime());
                dOS.writeBoolean(user.isMale());
                dOS.writeBoolean(flag = user.getCountry() != null);
                if (flag) dOS.writeUTF(user.getCountry().name());
            }
            dOS.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            DataInputStream dIS = new DataInputStream(inputStream);
            int usersCount = dIS.readInt();
            for (int i = 0; i < usersCount; i++) {
                User user = new User();
                boolean flag;
                if (flag = dIS.readBoolean())
                    user.setFirstName(dIS.readUTF());
                if (flag = dIS.readBoolean())
                    user.setLastName(dIS.readUTF());
                if (flag = dIS.readBoolean())
                    user.setBirthDate(new Date(dIS.readLong()));
                user.setMale(dIS.readBoolean());
                if (flag = dIS.readBoolean())
                    user.setCountry(User.Country.valueOf(dIS.readUTF()));
                this.users.add(user);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
