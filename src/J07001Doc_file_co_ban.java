/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngdna
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class J07001Doc_file_co_ban {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            throw  new RuntimeException(e);
        }
    }
}
