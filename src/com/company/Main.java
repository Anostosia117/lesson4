package com.company;

public class Main {

    public static void main(String[] args) {

        // ������� 1 � 2

        int clientOS = 1;
        int clientDeviceYear = 2005;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else if
        (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else if
        (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        }


        // ������� 3

        int year = 2020;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " ��� �������� ����������");
        } else {
            System.out.println(year + " ��� �� �������� ����������");
        }


        // ������� 4

        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("����������� ����: " + deliveryDays);
        } else if
        (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("����������� ����: " + (deliveryDays + 1));
        } else if
        (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("����������� ����: " + (deliveryDays + 2));
        }

        // ������� 5

        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12 ->
            System.out.println("����");
            case 3, 4, 5 ->
             System.out.println("�����");
            case 6, 7, 8 ->
              System.out.println("����");
            case 9, 10, 11 ->
              System.out.println("�����");
            default ->
              System.out.println("������ ������ �� ����������");
        }

        // ��� ���
        int NumberOfMonth = 3;
        switch (NumberOfMonth) {
            case 1:
            case 2:
            case 12:
                System.out.println("����");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("�����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("����");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�����");
                break;
            default:
                System.out.println("������ ������ �� ����������");
        }
    }
}
