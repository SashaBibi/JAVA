package com.cfuv.crypto.algoritm;

import com.cfuv.crypto.algoritm.StrUtil;
import java.util.Scanner;

import static com.cfuv.crypto.algoritm.StrUtil.encryption;

public class App {
    public static void main(String[] args){
        String number;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(StrUtil.encryption(str, 24));
        number= StrUtil.encryption(str,24);
        System.out.println(StrUtil.decryption(number,24));
    }
}
