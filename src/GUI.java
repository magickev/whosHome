import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

class GUI{
    private LinkedList<Person> personList = new LinkedList<Person>();

    GUI(){

        personList.add(new Person("Nancys-iPhone", 'N'));
        personList.add(new Person("Caseys-iPhone", 'C'));
        personList.add(new Person(">iPhone<", 'P'));
        personList.add(new Person("Kevins-Galaxy-A50", 'K'));

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setLocation(3175, 115);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        for(Person p: personList)
            panel.add(p.getJlabel());

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setTitle("wifiapp");
        frame.pack();
        frame.setVisible(true);

    }

    void updateLabels(String s){
        for(Person p: personList){
            JLabel changeLabel = p.getJlabel();
            boolean contains = s.contains(p.getName());
            if(contains && !changeLabel.isVisible()){
                //changes to opposite it
                p.changeLabelVisibility();

            }
            if(!contains && changeLabel.isVisible()){
                //changes to opposite it
                p.changeLabelVisibility();
            }

        }
    }
}
