package prob4;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if( "앱".equals( function ) ) {
			runApp();
		} else if( "음악".equals( function ) ) {
			downloadAndPlayMusic();
		} else {
			super.execute( function );
		}
	}
	
	private void downloadAndPlayMusic() {
		System.out.println( "다운로드해서 음악재생" );
	}

	private void runApp() {
		System.out.println( "앱 실행" );
	}
	
}
