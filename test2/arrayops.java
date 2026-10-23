class arrayops{
    public static void main(String[] args){
        int[] a={12, 24, 33, 73, 89, 4};
        int largest= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;

        for( int i=0; i<a.length; i++){
            if(a[i]> largest){
                second=largest;
                largest= a[i];
            }
            else if(a[i] >second && a[i]!=largest){
                second=a[i];
                
            }
        }
        if (second==Integer.MIN_VALUE){
            System.out.println("No second large elt present.");
        }else{
            System.out.println("Second largest elt is: " + second );
        }
    }
}
