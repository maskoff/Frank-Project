package com.frank.project;

/**
 * Class {@link Frank
 *
 * @author RomanMosiienko
 * @version 1.0
 * @since 02.06.16
 */
public class Frank {

    private Head head;
    private Brain brain;
    private Neck neck;
    private Shoulders shoulders;
    private Torso torso;
    private Back back;
    private Stomach stomach;
    private Chest chest;
    private LeftHand leftHand;
    private RightHand rightHand;
    private LeftLeg leftLeg;
    private RightLeg rightLeg;

    public void setHead(Head head) {
        this.head = head;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    public void setNeck(Neck neck) {
        this.neck = neck;
    }

    public void setShoulders(Shoulders shoulders) {
        this.shoulders = shoulders;
    }

    public void setTorso(Torso torso) {
        this.torso = torso;
    }

    public void setBack(Back back) {
        this.back = back;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public void setChest(Chest chest) {
        this.chest = chest;
    }

    public void setLeftHand(LeftHand leftHand) {
        this.leftHand = leftHand;
    }

    public void setRightHand(RightHand rightHand) {
        this.rightHand = rightHand;
    }

    public void setLeftLeg(LeftLeg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public void setRightLeg(RightLeg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public void create(){
        if(leftHand==null){
            System.out.println("I need the left hand");
        }else if(rightHand==null){
            System.out.println("I need the right hand");
        }else if(leftLeg==null){
            System.out.println("I need the left leg");
        }else if(rightLeg==null){
            System.out.println("I need the right leg");
        }else if(head==null){
            System.out.println("I need the head");
        }else if(brain==null){
            System.out.println("I need the brain");
        }else if(neck==null){
            System.out.println("I need the neck");
        }else if(shoulders==null){
            System.out.println("I need the shoulders");
        }else if(torso==null){
            System.out.println("I need the torso");
        }else if(back==null){
            System.out.println("I need the back");
        }else if(stomach==null){
            System.out.println("I need the stomach");
        }else if(chest==null){
            System.out.println("I need the chest");
        }else {
            System.out.println("I am alive");
        }
    }
}
