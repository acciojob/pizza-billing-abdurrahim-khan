package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private final int vegtopping = 70;
    private final int nonvegtopping = 120;

    private String cheesetoppingbill = "";
    private String takeawaybill = "";

    private boolean ischeesecalled = false;
    private boolean istoppingscalled = false;
    private boolean isbagcalled = false;
    private boolean isbillcalled = false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ischeesecalled)
        {
            this.ischeesecalled = true;
            this.price += 80;
            cheesetoppingbill = "Extra Cheese Added: "+80+"\n" + cheesetoppingbill;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!istoppingscalled)
        {
            this.ischeesecalled = true;
            if(this.isVeg)
            {
                this.price += vegtopping;
                cheesetoppingbill = cheesetoppingbill + "Extra Toppings Added: "+vegtopping+"\n";
            }
            else {
                this.price += nonvegtopping;
                cheesetoppingbill = cheesetoppingbill + "Extra Toppings Added: "+nonvegtopping+"\n";
            }
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(!isbagcalled)
        {
            isbagcalled = true;
            this.price+=20;
            takeawaybill = "Paperbag Added: "+20+"\n";
        }

    }

    public String getBill(){
        // your code goes here
        if(!isbillcalled)
        {
            isbillcalled = true;
            if(cheesetoppingbill.length() != 0)
            {
                this.bill += cheesetoppingbill;
            }
            if(takeawaybill.length() != 0)
            {
                this.bill += takeawaybill;
            }
            this.bill += "Total Price: "+this.price+"\n";
            return this.bill;
        }
        return "";
    }
}
