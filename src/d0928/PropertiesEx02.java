package d0928;
//2 660p
import java.util.*;
import java.io.*;

public class PropertiesEx02 {
    public static void main(String[] args) {
        //커맨드라인에서 inputfile을 지정하지 않으면 종료
        if(args.length != 1) {
            System.exit(0);
        }

        Properties prop = new Properties();

        String inputFile = args[0];

        try {
            prop.load(new FileInputStream(inputFile));
        } catch(IOException e) {
            System.out.println("지정된 파일 없음");
            System.exit(0);
        }

        String name = prop.getProperty("name");
        String[] data = prop.getProperty("data").split(", ");
        int max = 0, min= 0, sum = 0;

        for(int i = 0; i < data.length; i++) {
            int intV = Integer.parseInt(data[i]);

            if ( i == 0 ) max = min = intV;
            if ( max < intV ) max = intV;
            else if ( min > intV ) min = intV;

            sum+= intV;
        }

        System.out.println("이름 " + name);
        System.out.println("최대값 " + max);
        System.out.println("최소값 " + min);
        System.out.println("합계 " + sum);
        System.out.println("평균 " + (sum * 100.0 / data.length) / 100);
    }
}
