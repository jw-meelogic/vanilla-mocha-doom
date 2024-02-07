# Configuration

## Command-line parameters

In general, Mocha Doom supports all of the standard vanilla/DOS Doom command-line
parameters, plus some of its own. Here's the documentation for some that might
be useful:

* `-config <file1> [file2] ...`:
  Specify alternate configuration files to use (default is `default.cfg mochadoom.cfg`).
* `-truecolor`:
  Uses the all-new truecolor renderering mode, an enhancement that combines the
  oldschool renderer's look with true 24-bit depth colormaps and lighting.
* `-hicolor`:
  Uses the all-new hicolor renderering mode, an enhancement that restores the
  look and feel of the historical Doom v0.4 Alpha's HiColor mode,
  with 15-bit color depth and lighting.
* `-novert [disable]`:
  By default, vertical mouse movement for the player will
  be disabled, unless you use the `-novert disable` command.
* `-multiply <n>`:
  Multiplies the base resolution by `n` times. Acceptable
  values are 1-5. Base resolution is 320x200, default is `-multiply 3` (960x600)
  unless overriden. Maximum is 5 (1600x1000) which fits best for Full HD screens.
  This parameter has priority over `-height` and `-width`.
* `-width <x>`:
  Specifies window width to use e.g. `-width 640`.
  For now, this will be forbily set to the closest multiple
  of the base width, which is 320 pixels, so actual values
  are only 320, 640, 960, etc. with a maximum of 5 times
  the base width.
* `-height <y>`:
  Similar to `-width`, but operates on height. Base height
  is 200 pixels, so actual values are only 200, 400, 600, etc.
  If both are used, the one which yield the largest
  scaling will be used (scaling is isotropic).
* `-file <file1> [file2] ...`:
  Used to append PWADs. Can accept multiple files and
  quoted names in a row, except names starting with '-' and '+'.
* `-iwad <iwad_file>`:
  Allows specifying which IWAD to use
* `-millis`:
  Uses system  millisecond accuracy for the timer.
  Default is nanosecond accuracy, but you may wish
  to change it if you get timing issues e.g. with
  certain older AMD Athlon 64 X2 CPUs.
* `-fasttic`:
  Plays as fast as possible without cancelling adaptiveness, by using an as fast
  as possible timer. Useless unless you want to greatly speed up game time or something.
* `-serialrender`:
  Selects the (default) serial rendering code. This is OK for most machines.
* `-parallelrenderer [m] [n]`:
  Selects the parallel rendering code, which can be up to 100%
  faster on multicore machines, depending on the scene being
  rendered. The optional parameters `m` and `n` specify the number
  of wall and floor rendering threads to use.
  The default values are 2 and 1 respectively.
* `-fastdemo <demolump>`:
  Plays an external demo lump as fast as possible, skipping
  frames if not necessary.
* `-timedemo <demolump>`:
  Plays an external demo lump as fast as possible but by rendering every frame.
* `-playdemo <demolump>`:
  Plays back an external demo at normal speed.
* `-record <demolump>`:
  Records a demo. These demos are generally not very compatible
  with other ports in most cases, even though they are in vanilla
  Doom format, so use at your own risk.
* `-nosound`:
  Entirely shuts off sound and music.
* `-nosfx`:
  Disables sound effects.
* `-nomusic`:
  Disables music
* `-audiolines`:
  Uses a multithreaded, AudioLine based sound effects driver.
* `-clipsounds`:
  Uses a Clip-based sound effects driver.
* `-speakersound`:
  PC speaker emulation (uses default sound driver)
* `+map <ExMy> or <MAPxy>`:
  Warps to the specified Episode and Mission (e.g. E1M9) or
  game map (for Doom II, e.g. MAP31).
* `-episode [episode]`:
  Starts on episode (1-3)
* `-loadgame [game number]`:
  Starts from a saved game (0-5)
* `-nomonsters`:
  Starts the game without monsters
* `-respawn`:
  Causes enemies to respawn in non-Nightmare
* `-skill [skill level]`:
  Starts on skill level (1-5)
* `-fast`:
  Monsters at Skills 1 through 4 are accelerated (similar to Skill 5)

NOTE: Demo lumps are automatically appended a `.lmp` extension upon loading/saving.
DO NOT SPECIFY IT YOURSELF, otherwise it will result in a load error.

## Configuration file

The Doom configuration file is a text file which holds settings set by vanilla `setup.exe` and from inside the game and its menus.
The file is normally named `default.cfg`, but the `-config` command line parameter can be used to specify an alternate file to use.

The file takes the format of a list of configuration settings, with each line of the form: `<name> <value>`

### Vanilla Settings

#### Display

* `screenblocks`:
  Controls the screensize, ranging from 3-11. A value of 10 gives a fullscreen window with the status bar,
  while 11 gives fullscreen without status bar. The default value is 9 (10 in Mocha Doom).
* `detaillevel`:
  Boolean value which controls the resolution of the screen.
  The logic here is inverted: 0 is high resolution, while 1 is low resolution.
* `usegamma`:
  Gamma correction setting. This ranges from 0–4, with 0 representing no gamma correction, while 4 gives maximum gamma correction.
  The default value is 0.

#### Joystick

* `use_joystick`:
  Boolean value used to control whether the joystick is enabled. Default is 0 (off).
* `joyb_fire`:
  Joystick button used to make the player attack.
* `joyb_use`:
  Joystick button used to make the player "use" (activate switches, open doors, etc).
* `joyb_speed`:
  Joystick button used to make the player run. Can also be used to activate always run.
* `joyb_strafe`:
  Joystick button used to make the player strafe.

#### Keyboard

* `key_right`:
  Keyboard scan code of the key used to turn the player to the right.
* `key_left`:
  Keyboard scan code of the key used to turn the player to the left.
* `key_up`:
  Keyboard scan code of the key used to move the player forward.
* `key_down`:
  Keyboard scan code of the key used to move the player backwards.
* `key_strafeleft`:
  Keyboard scan code of the key used to make the player strafe left.
* `key_straferight`:
  Keyboard scan code of the key used to make the player strafe right.
* `key_fire`:
  Keyboard scan code of the key used to make the player attack.
* `key_use`:
  Keyboard scan code of the "use" key (key used to open doors, activate switches, etc).
* `key_strafe`:
  Keyboard scan code of the key used to make the player strafe rather than turn.
* `key_speed`:
  Keyboard scan code of the key used to make the player run.

#### Mouse

* `use_mouse`:
  Boolean value used to control whether the mouse is enabled. Default is 1 (on).
* `mouseb_fire`:
  Mouse button used to make the player attack.
* `mouseb_strafe`:
  Mouse button used to make the player strafe.
* `mouseb_forward`:
  Mouse button used to make the player move forward.
* `mouse_sensitivity`:
  Numerical value storing the value of the mouse sensitivity setting. The default value is "5".

#### Sound

* `sfx_volume`:
  The volume of sound effects, ranging from 0–15. The default is 8.
* `music_volume`:
  The volume of the background music, ranging from 0–15. The default is 8.
* `snd_channels`:
  The number of sound channels to use. The default is 3.
* `snd_musicdevice` (obsolete):
  Numeric value indicating which kind of music card is installed:
  (0) None
  (2) Adlib
  (3) Sound Blaster
  (4) Pro Audio Spectrum
  (5) Gravis UltraSound
  (6) WaveBlaster
  (7) Sound Canvas
  (8) General MIDI
  (9) Soud Blaster AWE32
* `snd_sfxdevice` (obsolete):
  Numeric value indicating which kind of card to use for sound effects:
  (0) None
  (1) PC Speaker
  (2) Sound Blaster
  (3) Pro Audio Spectrum
  (4) Gravis UltraSound
* `snd_sbport` (obsolete):
  I/O Port to use to access the soundblaster card.
* `snd_sbirq` (obsolete):
  IRQ to use to access the soundblaster card.
* `snd_sbdma` (obsolete):
  DMA channel to use when accessing the soundblaster card.
* `snd_mport` (obsolete):
  I/O Port to use to access the music card.

#### Other

* `show_messages`:
  Boolean value which controls whether messages are displayed in the heads up display. The default is 1 (on)
* `chatmacro0`:
  Multiplayer chat macro sent when `Alt+0` is pressed.
* `chatmacro1`:
  Multiplayer chat macro sent when `Alt+1` is pressed.
* `chatmacro2`:
  Multiplayer chat macro sent when `Alt+2` is pressed.
* `chatmacro3`:
  Multiplayer chat macro sent when `Alt+3` is pressed.
* `chatmacro4`:
  Multiplayer chat macro sent when `Alt+4` is pressed.
* `chatmacro5`:
  Multiplayer chat macro sent when `Alt+5` is pressed.
* `chatmacro6`:
  Multiplayer chat macro sent when `Alt+6` is pressed.
* `chatmacro7`:
  Multiplayer chat macro sent when `Alt+7` is pressed.
* `chatmacro8`:
  Multiplayer chat macro sent when `Alt+8` is pressed.
* `chatmacro9`:
  Multiplayer chat macro sent when `Alt+9` is pressed.

NOTE: The configuration file can be rearranged and comments added; however, the game will overwrite any such changes on exit.
The file can be made read-only to avoid this problem.

### Mocha Doom Settings

The file is normally named `mochadoom.cfg`, but the `-config` command line parameter can be used to specify an alternate file to use.

* `fullscreen`: `false` by default. `true` value turns on fullscreen mode instead of the default windowed mode.
  You can also use `Alt+Enter` key combination to switch to fullscreen in the game.
  It will attempt switching to a fullscreen mode compatible with the current resolution,
  or the closest available reported by the host OS (depending on the `fullscreen_mode` setting).

  NOTE:
  * Windows users might have to disable the Direct3D pipeline with the `-Dsun.java2d.d3d=false` JVM parameter for this to work.
  * Linux users might need to enable the OpenGL-based pipeline, which provides hardware acceleration: `-Dsun.java2d.opengl=true`
* `fullscreen_mode`:
  * `Best` (picks the closest supported resolution, might be buggy)
  * `Native` (default, the current display mode)
* `fullscreen_stretch`:
  * `Centre`
  * `Stretch`
  * `Fit` (default)
  * `Aspect_4_3`.
  Try with `fullscreen_mode=Native` if you experience problems.
* `fullscreen_interpolation`:
  * `Nearest` (default, fast and crispy)
  * `Bilinear` (smoother resize quality, slower)
  * `Bicubic` (slow, best vailable resize quality)
* `alwaysrun`: `false` by default
* `vanilla_key_behavior`: `true` by default
* `automap_plotter_style`:
  * `Thin` (default, vanilla)
  * `Thick` (scaled)
  * `Deep` (slightly rounded scaled)
* `enable_colormap_lump`: `true` by default, enables usage of COLORMAP lump read from WAD during lights and specials generation
* `color_depth`:
  * `Indexed` (default, 256 colors)
  * `HiColor` (32768 colors)
  * `TrueColor`: (16777216)
  * `AlphaTrueColor` (16777216, with Alpha transparency)
* `extend_plats_limit`: `true` by default, resize instead of "P_AddActivePlat: no more plats!"
* `extend_button_slots_limit`: `true` by default, resize instead of "P_StartButton: no button slots left!"
* `fix_blockmap`: `true` by default, add support for 512x512 blockmap
* `fix_gamma_ramp`: `false` by default, vanilla do not use pure black color because Gamma LUT calculated without it, doubling 128
* `fix_gamma_palette`: `false` by default, in vanilla, switching gamma with F11 hides Berserk or Rad suit tint
* `fix_sky_change`: `false` by default, in vanilla, sky does not change when you exit the level and the next level with new sky
* `fix_sky_palette`: `false` by default, in vanilla, sky color does not change when under effect of Invulnerability powerup
* `fix_medi_need`: `false` by default, in vanilla, message "Picked up a medikit that you REALLY need!" never appears due to bug
* `fix_ouch_face`: `false` by default, in vanilla, ouch face displayed only when acuired 25+ health when damaged for 25+ health
* `line_of_sight`:
  * `Vanilla` (default)
  * `Boom`
* `vestrobe`: `false` by default, strobe effect on automap cut off from vanilla
* `scale_screen_tiles`: `true` by default, if you scale screen tiles, it looks like vanilla
* `scale_melt`: `true` by default, if you scale melt and use DoomRandom generator (not truly random), it looks exacly like vanilla
* `semi_translucent_fuzz`: `false` by default, only works in `AlphaTrueColor` mode. Also ignored with `fuzz_mix=true`
* `fuzz_mix`: `false` by default, Maes unique features on Fuzz effect. Vanilla dont have that, so they are switched off by default
* `parallelism_realcolor_tint`: available number of processors, used for real color tinting to speed up
* `parallelism_patch_columns`: `0` by default. When drawing screen graphics patches, this speeds up column drawing, `<= 0` is serial
* `greyscale_filter`:
  * `Lightness`
  * `Average`
  * `Luminance` (default for invulnerability map)
  * `Luminosity`
  Used for FUZZ effect or with `-greypal` comand line argument.
* `scene_renderer_mode`:
  * `Serial` (default)
  * `Parallel`
  In vanilla, scene renderer is serial. Parallel can be faster.
* `reconstruct_savegame_pointers`: `true` by default, in vanilla, infighting targets are not restored on savegame load

### System Properties for Java 2D Technology

On some platforms you may have to tune Java system properties for better graphics performance.

#### OpenGL (Linux, Windows)

The OpenGL-based pipeline for Java 2D provides hardware acceleration for simple rendering operations
(text, images, lines, and filled primitives) as well as those that involve complex transforms, paints, composites, and clips.
This pipeline is currently disabled by default in Java.
To silently enable the OpenGL-based pipeline, set `sun.java2d.opengl` property to `true` e.g.:

`java -Dsun.java2d.opengl=true -jar mochadoom.jar`

For Mocha Doom this property seems to have a significant performance gain on Linux systems,
so it is provided in startup scripts by default.

#### D3D (Windows)

On a small subset of Windows 2000 systems with buggy Direct3D drivers, the use of Direct3D can cause a system crash.
To turn off the use of Direct3D, set `sun.java2d.d3d` property to `false` e.g.:

`java -Dsun.java2d.d3d=false -jar mochadoom.jar`

