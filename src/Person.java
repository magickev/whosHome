import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Person {
    private String name;
    private Character label;
    private JLabel jlabel;

    Person(String name, Character label) {
        this.name = name;
        this.label = label;
        jlabel = new JLabel(label.toString());
    }

    String getName(){
        return name;
    }

    public Character getLabel(){
        return label;
    }
    JLabel getJlabel(){
        return jlabel;
    }

    private void playSound(String soundFile) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File f = new File(soundFile);
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
    }

    //changes to opposite it
    void changeLabelVisibility(){
        jlabel.setVisible(!jlabel.isVisible());
        try {
            playSound("C:\\Users\\Kevin\\Documents\\bruh.wav");
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }

    }


}
