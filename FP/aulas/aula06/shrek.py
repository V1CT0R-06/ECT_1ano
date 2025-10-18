from pynput.keyboard import Key, Controller
import time
import urllib.request

keyboard = Controller()

# Fetch the text
with urllib.request.urlopen(
    "https://gist.githubusercontent.com/Hemzyy/581b034b7330bb2150a636e8c7eae370/raw/f482a9aaebb994078000e12574b79a4aa006f8c8/shrekscript.txt"
) as f:
    script = f.read().decode(errors="ignore")

# Split on single newlines
lines = script.splitlines()   # or: script.split('\n')

print('You have 4 seconds to click in a text box')
time.sleep(4)

# Type each line, then press Enter
for line in lines:
    keyboard.type(line)            # handles characters better than press/release per char
    keyboard.press(Key.enter)
    keyboard.release(Key.enter)
    time.sleep(0.03)               # small pause between lines-No, Shrek!
