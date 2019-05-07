package com.example.calculator;
import org.springframework.stereotype.Service;
/** This is calculator service class
	Hyeonmin LEE
*/

@Service
public class Calculator {
	int sum(int a, int b){
	return a + b;	
	}

        int dif(int a, int b){
                return a-b;
        }
}
