#!/bin/bash
cd /var/run
if [ -f backup.lock ]
	then
		echo already running
		exit 1
	else
	touch /var/run/backup.lock
	tar -czf /mnt/backup-$(date +%y-%m-%d).tgz /home/data
	rm /var/run/backup.lock
fi
