package dailyassignments;
interface Camera
{
	void takePhoto();
	void recordVideo();
}
interface MusicPlayer
{
	void playMusic();//by default all the methods that are created in interface will be public abstract
	void stopMusic();
}
class SmartPhone implements Camera,MusicPlayer
{
	//by default all the methods are public only, we can't reduce the visibility of the method in the child class
	public void takePhoto()
	{
		System.out.println("Photo Captured Successfully.");
	}
	public void recordVideo()
	{
		System.out.println("Video recording Started.");
	}
	public void playMusic()
	{
		System.out.println("Music is playing.");
	}
	public void stopMusic()
	{
		System.out.println("Music stopped.");
	}
	void makeCall()//normal concrete method.
	{
		System.out.println("Making a phone call.");
	}
}
public class Assignment29_InterfaceSmartDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp=new SmartPhone();
		sp.takePhoto();
		sp.recordVideo();
		sp.playMusic();
		sp.stopMusic();
		sp.makeCall();

	}

}
