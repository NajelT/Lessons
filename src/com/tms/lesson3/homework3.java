package com.tms.lesson3;

public class homework3 {

    public static void main(String[] args) {

int arr[]={0,10,20,30,40,50,60,70,80,90,100};
int sumeven=0;
int sumuneven=0;

for(int i=0;i<arr.length;i++){
    if (i%2==0){
        sumeven = sumeven + arr[i];}

    else if (!(i%2==0)){
        sumuneven+=arr[i];}}

        System.out.println("Сумма чисел, стоящих на четных местах = "+sumeven);
        System.out.println("Сумма чисел, стоящих на нечетных местах = "+sumuneven);
        System.out.println((sumeven-sumuneven)+" - разница чисел между суммами чётных и нечётных мест");
    }
}