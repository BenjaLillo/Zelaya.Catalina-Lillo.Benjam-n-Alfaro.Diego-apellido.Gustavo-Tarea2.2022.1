import javafx.scene.layout.Pane;

public class LampControl extends DomoticDeviceControl{
    //Código rellenado (copiado de Stage1)
    public LampControl(int channel, Cloud c){
        super(channel, c);  //Añadido dado que ahora LampControl extiende DomoticDeviceControl
        this.channel= channel;
        cloud = c;
        view = new LampControlView(this);
    }
    public void pressPower(){
        cloud.changeLampPowerState(channel);
    }
    public int getChannel(){
        return channel;
    }
    public Pane getView() { return view;}
    private int channel;
    private Cloud cloud;
    private Pane view;
}
