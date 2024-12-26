class Main {
    public static void main(String[] args) {
        int arr[]={10,45,67,89,34,23};
        int max=arr[0];
        int max2=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max2 && arr[i]<max)
            {
                max2=arr[i];
            }
        }
        System.out.println("Second largest element is:"+max2);
    }
}