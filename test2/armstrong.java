class armstrong{
    public static void main(String[] args){
         for (int i=0; i<=1000; i++){
            int num=i;
            int sum=0;
            int dig=0;
            int temp=num;
            while (temp>0){
                dig++;
                temp=temp/10;

            }
            temp=num;
            while(temp>0){
                int rem= temp%10;
                int pow=1;
                for(int j=1; j<=dig; j++){
                    pow= pow*rem;
                }

                sum=sum+pow;
                temp=temp/10;
            }
            if (sum==num){
                System.out.println(num+ " ");
            }
         }
    }
}
