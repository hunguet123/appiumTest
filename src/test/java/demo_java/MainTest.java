package demo_java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainTest 
{
    /**
     * Rigorous Test :-)
     * @throws InterruptedException
     * @throws IOException
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        ChatAppTest test_obj = new ChatAppTest();
        test_obj.accountTest = new ArrayList<>();

        Map<String, String> firstAccount = new HashMap<>();
        firstAccount.put("email", "hungk19elqd@gmail.com");
        firstAccount.put("password", "123456");
        test_obj.accountTest.add(firstAccount);

        Map<String, String> secondAccount = new HashMap<>();
        secondAccount.put("email", "hungk19elqd@gmail.com");
        secondAccount.put("password", "123123");
        test_obj.accountTest.add(secondAccount);

        Map<String, String> thirdAccount = new HashMap<>();
        thirdAccount.put("email", "abc@gmail.com");
        thirdAccount.put("password", "123123");
        test_obj.accountTest.add(thirdAccount);



        System.out.println("---");
        //login test
        test_obj.test_login();

        test_obj.accountTest.clear();

    }
}
