@echo off
rem Compiler batch file for the TI TMS320C62x

cl6x -q -o0 -op0 -mt -mx -mh -mi -k -mw -mv6200 %1.c -z lnkc6x.cmd -l rts6201.lib -o %1.out -m %1.map

