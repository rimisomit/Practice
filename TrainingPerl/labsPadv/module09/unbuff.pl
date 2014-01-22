#! /usr/bin/perl
# getc unbuff

if ($BSD_STYLE) {
        system "stty cbreak </dev/tty >/dev/tty 2>&1";
    }
    else {
        system "stty", '-icanon', 'eol', "\001";
    }
    $key = getc(STDIN);
    if ($BSD_STYLE) {
        system "stty -cbreak </dev/tty >/dev/tty 2>&1";
    }
    else {
        system 'stty', 'icanon', 'eol', '^@'; # ASCII NUL
    }
    print "\n";
