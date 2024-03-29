import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N+1];
        arr[0] = 0;
        arr[1] = 0;

        for(int i=2;i<=N;i++){
            arr[i] = arr[i-1] + 1; //1을 뺄 경우
            if(i % 2 == 0 && arr[i] > arr[i/2] + 1){ //2 나눌경우
                arr[i] = arr[i/2] + 1;
            }
            if(i % 3 == 0 && arr[i] > arr[i/3] + 1){ //3 나눌경우
                arr[i] = arr[i/3] + 1;
            }
        }

        System.out.println(arr[N]);
    }

}
