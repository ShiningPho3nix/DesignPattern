package adapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMpFour(String fileName) {
		throw new IllegalArgumentException("fileName: " + fileName + ". VLC Player tired to Play MP4 File!");
	}

}
