package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("携帯電話番号を入力してください:");
    String mobilPhoneNumber = scanner.nextLine();
    Pattern pattern = Pattern.compile("^(070|080|090)-\\d{4}-\\d{4}$");
    Matcher matcher = pattern.matcher(mobilPhoneNumber);
    if (matcher.matches()) {
      System.out.println(mobilPhoneNumber + "は有効な携帯電話番号です。");
    } else {
      System.out.println(mobilPhoneNumber + "無効な携帯電話番号です。");
    }
  }
}
