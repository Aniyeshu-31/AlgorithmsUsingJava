package com.company;
import java.util.*;
public class ProjectSample {
        static class Station{
            String Stationname,TrainName,SourceTime,DestinationTime;
            String srno;
            Station(String srno,String Stationname,String TrainName,String SourceTime,String DestinationTime) {
                this.srno=srno;
                this.Stationname = Stationname;
                this.TrainName = TrainName;
                this.SourceTime = SourceTime;
                this.DestinationTime = DestinationTime;
            }
        }
        public static void main(String[] args) {
           Station obj=new Station("1.","Mumbai -> Ahemdabad","ACDoubleDecker","14:30","21:00");
            System.out.print("   Station Name   "+"        TrainName          "+"   SourceTime  "+"       DestinationTime");
            System.out.println();
            System.out.print(obj.srno+" "+obj.Stationname+"    "+obj.TrainName+"        "+obj.SourceTime+"              "+obj.DestinationTime);
        }
    }

