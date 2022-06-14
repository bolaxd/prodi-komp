# import vlc
from pydub import AudioSegment
from pydub.playback import play
import urllib
import vlc, time, requests


def download_file(url, filename):
    local_filename = filename
    # NOTE the stream=True parameter below
    with requests.get(url, stream=True) as r:
        r.raise_for_status()
        with open(local_filename, 'wb') as f:
            for chunk in r.iter_content(chunk_size=8192): 
                # If you have chunk encoded response uncomment if
                # and set chunk_size parameter to None.
                #if chunk: 
                f.write(chunk)
    return local_filename
# --

def talk(text, lang = 'id'):
    URL = f"https://www.freetranslations.org/speak.php?word={text.replace(' ', '+')}&lang={lang}"
    LANG = ['ar', 'bg', 'ca', 'zh-CHT', 'hr', 'cs', 'da', 'id', 'et', 'en', 'fi', 'fr', 'de', 'el', 'hu', 'nl', 'he', 'hi', 'it', 'ja',
    'ko', 'lv', 'lt', 'ms', 'mt', 'no', 'pl', 'pt', 'ro', 'ru', 'sk', 'sl', 'es', 'sv', 'th', 'tr', 'ur', 'uk', 'vi', 'cy', 'yua']
    audio = download_file(URL, 'audi')
    print(audio)
    p = vlc.MediaPlayer(audio)
    p.audio_set_volume(100)
    p.play()
    time.sleep(1)
# --


talk('Oke bisa kah')