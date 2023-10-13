package package2;

public class Prblm941 {
	public boolean validMountainArray(int[] arr) {
        boolean upwards =false;
        boolean downwards = false;
        if(arr.length<3) return false;
        
        for(int i=0;i<arr.length-1;i++){
            
            if(!downwards&& i==arr.length-1) return false; 
            if(arr[i]==arr[i+1])return false;
            if(arr[i]<arr[i+1]){
                if(downwards) return false;
                upwards=true;
               
                downwards=false;
            }if( arr[i]>arr[i+1]){
                if(i>arr.length-1 || !upwards) return false;
                downwards=true;
               
                
            }
        }
        return upwards&&downwards;
    }
}
