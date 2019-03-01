package adapterPattern;

public class MpFourPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		throw new IllegalArgumentException("fileName: " + fileName + ". MP4 Player tired to Play VLC File!");
	}

	@Override
	public void playMpFour(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}

}
