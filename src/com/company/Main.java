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
        (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        }
    }
}