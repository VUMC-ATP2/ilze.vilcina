package oop_homework;

import lombok.Getter;
import lombok.Setter;

@Getter
public class DiscountRate {

//    a.	Premium biedri saņem: 20%
//    b.	Gold biedri saņem: 15%
//    c.	Silver biedri saņem: 10%
// public static double serviceDiscountPremium = 0.2;
// public static double serviceDiscountGold = 0.15;
// public static double serviceDiscountSilver = 0.1;
// public static double productDiscountPremium = 0.1;
// public  static double productDiscountGold = 0.1;
// public static double productDiscountSilver = 0.1;

 public static double getServiceDiscountRate(String type) {
  double serviceDiscountPremium = 0.2;
  double serviceDiscountGold = 0.15;
  double serviceDiscountSilver = 0.1;

  if (type == "Premium") {
   return serviceDiscountPremium;
  } else if (type == "Gold") {
   return serviceDiscountGold;
  } else if (type == "Silver") {
   return serviceDiscountSilver;
  } else
   return 0.0;
  };


 public static double getProductDiscountRate(String type) {
  double productDiscountPremium = 0.1;
 double productDiscountGold = 0.1;
 double productDiscountSilver = 0.1;

  if (type == "Premium") {
   return productDiscountPremium;
  } else if (type == "Gold") {
   return productDiscountGold;
  } else if (type == "Silver") {
   return productDiscountSilver;
  } else
   return 0.0;
 };

 }



