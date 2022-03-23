class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        
        while(num > 0) {
            if(num >= 1000) {
                sb.append("M");
                num = num - 1000;
            }
            else if(num >= 500) {
                if(num < 900) {
                    sb.append("D");
                    num = num - 500;
                } else {
                    sb.append("CM");
                    num = num - 900;
                }
            }
            else if(num >= 100) {
                if(num < 400) {
                    sb.append("C");
                    num = num - 100;
                } else {
                    sb.append("CD");
                    num = num - 400;
                }
            }
            else if(num >= 50) {
                if(num < 90) {
                    sb.append("L");
                    num = num - 50;
                } else {
                    sb.append("XC");
                    num = num - 90;
                }
            }
            else if(num >= 10) {
                if(num < 40) {
                    sb.append("X");
                    num = num - 10;
                } else {
                    sb.append("XL");
                    num = num - 40;
                }
            }
            else if(num >= 5) {
                if(num < 9) {
                    sb.append("V");
                    num = num - 5;
                } else {
                    sb.append("IX");
                    num = num - 9;
                }
            }
            else {
                if(num < 4) {
                    sb.append("I");
                    num = num - 1;
                } else {
                    sb.append("IV");
                    num = num - 4;
                }
            }
        }
        
        return sb.toString();
    }
}