/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Import;

import Business.Aeroplane;
import Business.Airliner;
import Business.Flight;
import Business.Seat;
import Business.TravelAgency;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aravind
 */
public class Mainclass {
    
  public static void main(String[] args) throws IOException, ParseException
  {
  String file1 = "AirplaneDeatils.csv";
  String file2 = "CustomerDetails.csv";
  String file3 = "FlightDetails.csv";
  //String file3 = "/Users/aravind/Desktop/FlightDetails.csv";
  
  
  BufferedReader br = null;
  BufferedReader br1 = null;
  BufferedReader br2 = null;
  BufferedReader br3= null;
  
  String line1 = "";
  String line2 = "";
  String line3 = "";
  String splitby = ",";
  
  try{
       br = new BufferedReader(new FileReader(file1));
       
       TravelAgency ta = new TravelAgency();
       List<String> strr = new ArrayList<String>();
       while((line1 = br.readLine())!=null)
       {
           Airliner airliner = ta.addairliner();
           String[] airlinerdetails = line1.split(splitby);
           airliner.setAirlinername(airlinerdetails[0]);
           Aeroplane ap = airliner.getFleetlist().addaeroplane();
           ap.setManufacturer(airlinerdetails[1]);
           ap.setModelNumber(airlinerdetails[2]);
           ap.setAirport(airlinerdetails[3]);
           ap.setYear(Integer.parseInt(airlinerdetails[4]));
           //System.out.println("inside airlinlist");
           
           br1 = new BufferedReader(new FileReader(file3));
           while ((line2 = br1.readLine())!=null)
           {
               String[] flightDetails = line2.split(splitby);
               if(airlinerdetails[2].equals(flightDetails[0]))
               {
                   Flight f1 = ap.addflight();
                   f1.setFightno(flightDetails[0]);
                   f1.getFlightsch().setDestination(flightDetails[1]);
                   f1.getFlightsch().setOrigin(flightDetails[2]);
                   f1.getFlightsch().setEnddate(new SimpleDateFormat("dd-MM-yyyy").parse(flightDetails[3]));
                   f1.getFlightsch().setStartdate(new SimpleDateFormat("dd-MM-yyyy").parse(flightDetails[4]));
                  
                  //System.out.println("values inside flight set properly");
                 
                  
                  br2 = new BufferedReader(new FileReader(file2));
                   while ((line3 = br2.readLine())!=null)
                   {
                       String[] seatDetails = line3.split(splitby);
                       if(flightDetails[0].equals(seatDetails[0]))
                       {
                           Seat s1 = f1.addseat();
                           s1.setFlightno(seatDetails[0]);
                           s1.setSeattype(seatDetails[1]);

                           s1.setCost(Integer.parseInt(seatDetails[2]));
                           s1.getCustomer().setAge(Integer.parseInt(seatDetails[3]));
                           s1.getCustomer().setName(seatDetails[4]);
                          // s1.getCustomer().setFlightno(seatDetails[4]);
                           //System.out.println("values set propeprly");
                           
                       }
                   }
                   
               }
               
           }  
               
       }  
       int sum=0; int windowsum=0; int count=0;
            int middlesum=0; int count1=0;
            int aislesum=0; int count2=0;
            int window=1000;
            int middle=500;
            int aisle=200;
            for(Airliner air:ta.getAirlinerlist())
            {
                
                System.out.println("Airline Name:" + air.getAirlinername()+"");
                
               for(Aeroplane ap :air.getFleetlist().getAeroplanelist())
               {
                   System.out.println("Model Number:" + ap.getModelNumber() + " " + "Manufacturer:" + ap.getManufacturer() + " " + "Manufacture Year:" 
                   + ap.getYear()+ " " + "Airport name: " + ap.getAirport());
                   
                for(Flight f1 : ap.getFlightlist())
                {
                    
                    
                    //System.out.println("inside flight");
                  //  System.out.println("Flight Number:" + f1.getFightno()+ " " + "From Location:" + fll.getFlightsch().getOrigin()
                   // + " " + "Start Date:" + fll.getFlightsch().getStartdate()+ " " + "To Location:" + fll.getFlightsch().getDestination()+ " " + "Reach Date:" 
                         //   + fll.getFlightsch().getEnddate());
                    
                 for(Seat ss : f1.getSeatslist())
                 {
                     System.out.println("Seat Location:" + ss.getSeattype()+ " " + " Name:" + ss.getCustomer().getName()+ " " + "Age:"
                     + ss.getCustomer().getAge()+ " " + "Price:" + ss.getCost());
                             
                    sum+=ss.getCost();
                    
                    if(ss.getSeattype().equalsIgnoreCase("window"))
                    {
                        windowsum+=window;
                        count++;
                    }
                    if(ss.getSeattype().equalsIgnoreCase("Middle"))
                    {
                        middlesum+=middle;
                        count1++;
                    }
                    if(ss.getSeattype().equalsIgnoreCase("aisle"))
                    {
                        aislesum+=aisle;
                        count2++;
                    }
                 }
                }
               }
                
                
            }
          /* System.out.println("Total Revenue:" + sum);
            System.out.println("Number of window seaters:" +count + " " + "Window Revenue:" + windowsum);
            System.out.println("Number of Middle seaters:" +count1 + " " + "Middle Revenue:" + middlesum);
            System.out.println("Number of Aisle seaters:" +count2 + " " + "Aisle Revenue:" + aislesum);*/
            
            int totalrevenue = 0;
            
            br3 = new BufferedReader(new FileReader(file2));
            String line4 = "";
            
           
            List <Integer> rev = new ArrayList<Integer>();
            List <String> str = new ArrayList<String>();
            while ((line4 = br3.readLine()) != null) 
            {
             String[] a1 = line4.split(splitby);
             
             rev.add(Integer.parseInt(a1[2]));
             str.add(a1[5]);
               // System.out.println(str);
            }
            
           int sum1=0;
           int sum2=0;
            for (int i=0;i<rev.size();i++)
            {
                totalrevenue+=rev.get(i);
            
                String str1=str.get(i);
                if(str1.equalsIgnoreCase("emirates"))
                {
                    sum1+=rev.get(i);
                }
                if(str1.equalsIgnoreCase("etihad"))
                {
                    sum2+=rev.get(i);
                }
            
            }
            System.out.println("Total Revenue:" + totalrevenue);
            System.out.println("Emirates Revenue:" + sum1);
            System.out.println("Ethiad Revenue:" + sum2);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
       
       
  
  
  }
  
  
            }
            }
  
            }
    
    private static void getlist(TravelAgency t, List<String> airl)
    {
        ArrayList<Airliner> airline = t.getAirlinerlist();
        for(String s: airl)
        {
            int cost = 0 ;
            for(Airliner al: airline)
            {
                if(s.equals(al.getAirlinername()))
                {
                    for(Aeroplane ap : al.getFleetlist().getAeroplanelist())
                    {
                        for(Flight f:ap.getFlightlist())
                        {
                            for(Seat ss: f.getSeatslist())
                            {
                                cost+= ss.getCost();
                            }
                        }
                    }
                }
            }
        }
        
    }
}
