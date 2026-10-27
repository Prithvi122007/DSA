class Solution {
    public int romanToInt(String s) {
        int sum=0;
        String I,V,X,L,C,D,M;
        for(int i=0;i<s.length();i++){
            char l=s.charAt(i);
            if(l == 'I'){
                if(i+1<s.length()){
                    if(s.charAt(i+1)=='V'){
                        sum = sum + 4;
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1)=='X'){
                        sum = sum + 9;
                        i++;
                        continue;
                    }
                }
                sum = 1+sum;
            }
            else if(l=='V'){
                sum = 5+sum;
            }
            else if(l=='X'){
                if(i+1<s.length()){
                    if(s.charAt(i+1)=='L'){
                        sum = sum + 40;
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1)=='C'){
                        sum = sum + 90;
                        i++;
                        continue;
                    }
                }
                sum = 10+sum;
            }
            else if(l=='L'){
                sum = 50+sum;
            }
            else if(l=='C'){
                if(i+1<s.length()){
                    if(s.charAt(i+1)=='D'){
                        sum = sum + 400;
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1)=='M'){
                        sum = sum + 900;
                        i++;
                        continue;
                    }
                }
                sum = 100+sum;
            }
            else if(l=='D'){
                sum = 500+sum;
            }
            else if(l=='M'){
                sum = 1000+sum;
            }
        }
        return sum;
    }
}