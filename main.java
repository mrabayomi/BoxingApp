// Need G4P library
import g4p_controls.*;
import controlP5.*;

ControlP5 cp5;

Textlabel myTextlabelA;
Textlabel myTextlabelB;
String textValue = "";
String [] hello = split(textValue, ' ');

Button button1;

public void setup(){
  size(800,500);
  
  PFont font = createFont("arial",20);
  
  cp5 = new ControlP5(this);
 
   myTextlabelA = cp5.addTextlabel("label")
                    .setText("Performance Screen")
                    .setPosition(260,20)
                    .setColorValue(0xffffffff)
                    .setFont(createFont("Georgia",30))
                    ; 
                    
      myTextlabelB = cp5.addTextlabel("label1")
                    .setText("Where would\n you like\n to go?")
                    .setPosition(310,260)
                    .setColorValue(0xffffffff)
                    .setFont(createFont("Georgia",25))
                    ;                 
                   
  cp5.addTextfield("textValue")
     .setPosition(20,120)
     .setLabel("Please Enter your name")
     .setSize(200,40)
     .setFont(createFont("arial",20))
     .setAutoClear(false)
     ;
       
  cp5.addBang("clear")
     .setPosition(240,120)
     .setSize(80,40)
     .getCaptionLabel().align(ControlP5.CENTER, ControlP5.CENTER)
     ;    
    
//   cp5.addTextfield("input")
//     .setPosition(20,280)
//     .setLabel("Force From Left hand Boxing glove")
//     .setSize(147,170)
//     .setFont(font)
//     .setFocus(true)
//     .setColor(color(255,0,120))
//     ;
//     
//   cp5.addTextfield("input2")
//     .setPosition(220,280)
//     .setLabel("Force From Right hand Boxing glove")
//     .setSize(147,170)
//     .setFont(font)
//     .setFocus(true)
//     .setColor(color(255,100,0))
//     ;
//    
//   cp5.addTextfield("input3")
//     .setPosition(420,380)
//     .setLabel("Amount of Punches!")
//     .setSize(45,40)
//     .setFont(font)
//     .setFocus(true)
//     .setColor(color(255,100,0))
//     ;
    
//     
//   cp5.addButton("Save data")
//     .setValue(0)
//     .setColorBackground(0xff0000a0) //Dark Blue Color html, hexadecimal color code
//     .setPosition(20,540)
//     .setSize(100,25)
//     ;
     
     
   cp5.addButton("Savefolder")
     //.setValue(0)
     .setColorBackground(0xff0000ff) //Blue Color html, hexadecimal color code
     .setPosition(310,380)
     .setSize(155,85)
     .activateBy(1)
     ;  
     
     cp5.addButton("Realtime")
  //button1 =  cp5.addButton("Me")
     //.setValue()
     .setColorBackground(0xff808080) //Grey Color html, hexadecimal color code
     .setPosition(130,200)
     .setSize(155,85)
     .activateBy(1)
     //.isPressed(open()
     ;
     
     
   cp5.addButton("BoxingVisual")
     //.setValue(0)
     .setColorBackground(0xffff00ff) //Magnenta Color html, hexadecimal color code
     .setPosition(480,200)
     .setSize(155,85)
     ;     
      
       
     
     
       textFont(font);
  //createGUI();
  //customGUI();
  // Place your setup code here
  
}


public void draw(){
  background(10);
  text(textValue, 360,260);
}



public void clear() {
  cp5.get(Textfield.class,"textValue").clear();
}

// void Click_here_to_view_Real_time_graph()
public void Savefolder(int value) {
  
 link("C:/Users/User/Boxing/");

  }

public void Realtime(int value) {
  
 open("C:/Users/User/Right_hand_graph/application.windows32/Right_hand_graph");
 open("C:/Users/User/Left_hand_graph/application.windows32/Left_hand_graph");
  }
  
public void BoxingVisual(int value) {
  
 open("C:/Users/User/right_application.windows32_2/Boxing_righthand2");
 open("C:/Users/User/new_application.windows32/boxing_new");
  }

  
void controlEvent(ControlEvent theEvent) {
  if(theEvent.isAssignableFrom(Textfield.class)) {
    println("controlEvent: accessing a string from controller '"
            +theEvent.getName()+"': "
            +theEvent.getStringValue()
            );
    saveStrings("C:/Users/User/Boxing/"+ textValue +".txt", hello);        
  }
//   else if(theEvent.isAssignableFrom(Button.class))
//    {
//       open("C:/Users/User/Libraries/Documents/abs.txt");
//    }   
//    else if(mousePressed) {
//      
//      if(button1.ressed())
//      {
//        open("C:/Users/User/Documents/data.txt");
//  }
  //saveStrings("C:/Users/User/"+theEvent.getName()+"':"+theEvent.getStringValue()+".txt", hello);
  
    }
//}




