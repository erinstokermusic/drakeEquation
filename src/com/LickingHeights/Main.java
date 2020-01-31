package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

drakeEquation();

    }

    public static void drakeEquation(){
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */
int N;
int rStar;
double f_p;
int numberOfExoplanets;
double f_l;
double f_i;
double f_c;
int L;

Scanner keyboard;
keyboard = new Scanner(System.in);

System.out.println("Give me the rate at which stars form in the Milky Way.");
rStar = keyboard.nextInt();
System.out.println("Give me the fraction of those stars that have planets orbiting them.");
f_p = keyboard.nextDouble();
System.out.println("Give me the fraction of those planets that reside in the goldilocks zone.");
numberOfExoplanets = keyboard.nextInt();
System.out.println("Give me the fraction of those planets that have life.");
f_l = keyboard.nextDouble();
System.out.println("Give me the fraction of those planets with life that have " +
        "the capacity to develop intelligent life.");
f_i = keyboard.nextDouble();
// System.out.println("Give me the fraction of that intelligent life that" +
      //  " will be able to communicate in a way we can understand");

N = rStar * f_p * numberOfExoplanets * f_l * f_i * f_c * L;


System.out.println("The number of intelligent" +
        "species that are out there\nand can communicate with us is" + N);
    }

}
