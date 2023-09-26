
import model.FileIO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MINH TUAN
 */
public class Main {
    public static void main(String[] args) {
        
        FileIO io = new FileIO();
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";
        io.normalizeData(inputFilePath, outputFilePath);
    }
}
