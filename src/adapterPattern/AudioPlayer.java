package adapterPattern;

public class AudioPlayer implements MediaPlayer {

	private MediaAdapter adapter = new MediaAdapter();

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			adapter.play(audioType, fileName);
		} else {
			throw new IllegalArgumentException("audioType: " + audioType);
		}

	}

}
