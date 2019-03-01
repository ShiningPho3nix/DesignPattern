package adapterPattern;

public class MediaAdapter implements MediaPlayer {

	private static final AdvancedMediaPlayer VLC_PLAYER = new VlcPlayer();
	private static final AdvancedMediaPlayer MP_FOUR_PLAYER = new MpFourPlayer();;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			VLC_PLAYER.playVLC(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			MP_FOUR_PLAYER.playMpFour(fileName);
		} else {
			throw new IllegalArgumentException("audioType: " + audioType);
		}

	}

}
