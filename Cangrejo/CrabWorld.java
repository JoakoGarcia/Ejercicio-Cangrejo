import greenfoot.*; 

import java.util.Random; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @nanoMX
 * @1.000000
 */
public class CrabWorld extends World
{
    public final int TIEMPO_NIVEL=15;
    private Counter contGusanos;
    private Counter contVidas;
    private Crab cangrejo;
    private worm gusano;
    private lobster langosta;
    private Counter contTiempo;
    private SimpleTimer reloj;
    private SimpleTimer relojworm;
    
    private int f;
    private int i;

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1);
        contGusanos = new Counter("Gusanos: ");
        contVidas = new Counter("Vidas: ");
        addObject(contGusanos,57,15);

        addObject(contVidas,400,15);
        contVidas.setValue(3);
        prepare();
        contTiempo.setValue(TIEMPO_NIVEL);
        reloj=new SimpleTimer();
        relojworm=new SimpleTimer();
        f=0;
    }

    public int regresavida(){
        return contVidas.getValue();

    }
    
    public void started(){
       //System.out.println("RUN");
    
    }
    
    public void stopped(){
    //System.out.println("stop program");
    
    }
    
    public void act()
    {   int x=0;
        int y=0;
       if(reloj.millisElapsed()>1000){
        contTiempo.add(-1);
        reloj.mark();
        f++;
        if(f==3){
            System.out.println("Gusano aleotorio");
            gusano=new worm();
            x=Greenfoot.getRandomNumber(500);
            y=Greenfoot.getRandomNumber(500);
            addObject(gusano,x,y);
            f=0;
        
        }
        }
        
       if(contTiempo.getValue()==0){
           Label etiquetaTiempoFin = new Label("Tiempo Agotado",55);
           addObject(etiquetaTiempoFin,249,249);
           Greenfoot.stop();
        }
      
       
        
        
    }
    
    

    public void incrementaGusanos()
    {
        contGusanos.add(1);
   
    }

    public void decrementaVidas()
    {
        contVidas.add(-1);
        
    }

    
    public void cangrejoAtrapado(){
        decrementaVidas();
        cangrejo.setLocation(100,100);
        langosta.setLocation(250,250);
        if(contVidas.getValue()==0){
            Label etiquetaFin = new Label("Game Over",55);
            addObject(etiquetaFin,250,250);
            Greenfoot.stop();
        }

    
    }

    public void comioGusano(){
        incrementaGusanos();

        if(contGusanos.getValue()==19){
            Label etiquetaWINNER = new Label("WINNER:  ",55);
            addObject(etiquetaWINNER,250,250);
            //addObject(etiquetaWINNER,249,249);
            Greenfoot.stop();

        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(){
        cangrejo = new Crab();
        addObject(cangrejo,256,279);
        worm worm = new worm();
        addObject(worm,261,458);
        langosta = new lobster();
        addObject(langosta,178,124);
        worm worm2 = new worm();
        addObject(worm2,487,361);
        worm worm3 = new worm();
        addObject(worm3,151,385);
        worm worm4 = new worm();
        addObject(worm4,80,252);
        worm worm5 = new worm();
        addObject(worm5,65,393);
        worm worm6 = new worm();
        addObject(worm6,67,508);
        worm worm7 = new worm();
        addObject(worm7,439,537);
        worm worm8 = new worm();
        addObject(worm8,550,498);
        worm worm9 = new worm();
        addObject(worm9,370,449);
        worm worm10 = new worm();
        addObject(worm10,192,504);
        worm worm11 = new worm();
        addObject(worm11,437,162);
        worm worm12 = new worm();
        addObject(worm12,437,162);
        worm worm13 = new worm();
        addObject(worm13,463,247);
        worm worm14 = new worm();
        addObject(worm14,383,275);
        worm worm15 = new worm();
        addObject(worm15,322,169);
        worm worm16 = new worm();
        addObject(worm16,356,70);
        worm worm17 = new worm();
        addObject(worm17,517,64);
        Counter counter = new Counter();
        addObject(counter,234,15);
        counter.setLocation(234,14);
        removeObject(counter);
        contTiempo = new Counter("Tiempo:");
        addObject(contTiempo,258,54);

       
    }
}
