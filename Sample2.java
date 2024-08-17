package SampleApplication;

import java.util.Scanner;

public class Sample2 
{
	private static Scanner scanner = new Scanner(System.in);
	private static int ticketPrice;
	
    public static void main(String[] args) 
    {
        
        
        String[] stations = {"Thambaram", "Thambaram Sanatorium", "Chrompet", "Pallavaram"};
        int[] stationNumbers = {1, 2, 3, 4};

        
        System.out.println("Available Stations:");
        
        name(stations,stationNumbers);

        System.out.print("Do you want train ticket enter 't' or platform ticket enter 'p': ");
        ticketOption();
        
        scanner.close();
    }
    
    public static void name(String [] stations, int [] stationNumbers) 
	{
		 for (int i = 0; i < stations.length; i++) 
	        {
	            System.out.println(stationNumbers[i] + ": " + stations[i]);
	        }
	}
    
	public static void ticketOption() {
		String choice = scanner.next().toLowerCase();

        if (choice.equals("t") ) 
        {
            trainTicket();
        } 
        else if (choice.equals("p")) 
        {
            final int platformTicketPrice = 5;
            System.out.println("Platform Ticket Price: Rs." + platformTicketPrice);
        } 
        else 
        {
            System.out.println("Invalid choice. Please enter 't' or 'p'.");
            ticketOption();
        }
		
	}
	
	public static void trainTicket() 
	{
		System.out.print("Enter your source station number: ");
        int StartingPoint = scanner.nextInt();
        if(StartingPoint==0)
        {
        	System.out.println("Enter a valid station number");
        	trainTicket();
        }
        
        System.out.print("Enter your destination station number: ");
        int destinationStation = scanner.nextInt();

        
        int numberOfStations = Math.abs(destinationStation - StartingPoint) + 1;

        
        if(numberOfStations<5 && destinationStation>0)
        {
        	if (numberOfStations <= 2) 
            {
                ticketPrice = 5;
            } 
            else if (numberOfStations <= 3) 
            {
                ticketPrice = 10;
            }
            else if(numberOfStations <= 4) 
            {
                ticketPrice = 15;
            }
            
            System.out.println("Number of Stations: " + numberOfStations);
            System.out.println("Ticket Price: Rs." + ticketPrice);
        }
        else
        {
        	System.out.println("Enter a valid station number");
        	trainTicket();	
        }
	}
}
