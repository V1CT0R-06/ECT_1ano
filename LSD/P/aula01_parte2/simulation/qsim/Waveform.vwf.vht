-- Copyright (C) 2023  Intel Corporation. All rights reserved.
-- Your use of Intel Corporation's design tools, logic functions 
-- and other software and tools, and any partner logic 
-- functions, and any output files from any of the foregoing 
-- (including device programming or simulation files), and any 
-- associated documentation or information are expressly subject 
-- to the terms and conditions of the Intel Program License 
-- Subscription Agreement, the Intel Quartus Prime License Agreement,
-- the Intel FPGA IP License Agreement, or other applicable license
-- agreement, including, without limitation, that your use is for
-- the sole purpose of programming logic devices manufactured by
-- Intel and sold by Intel or its authorized distributors.  Please
-- refer to the applicable agreement for further details, at
-- https://fpgasoftware.intel.com/eula.

-- *****************************************************************************
-- This file contains a Vhdl test bench with test vectors .The test vectors     
-- are exported from a vector file in the Quartus Waveform Editor and apply to  
-- the top level entity of the current Quartus project .The user can use this   
-- testbench to simulate his design using a third-party simulation tool .       
-- *****************************************************************************
-- Generated on "02/14/2025 11:33:49"
                                                             
-- Vhdl Test Bench(with test vectors) for design  :          VHDLDemo
-- 
-- Simulation tool : 3rd Party
-- 

LIBRARY ieee;                                               
USE ieee.std_logic_1164.all;                                

ENTITY VHDLDemo_vhd_vec_tst IS
END VHDLDemo_vhd_vec_tst;
ARCHITECTURE VHDLDemo_arch OF VHDLDemo_vhd_vec_tst IS
-- constants                                                 
-- signals                                                   
SIGNAL inPort0 : STD_LOGIC;
SIGNAL inPort1 : STD_LOGIC;
SIGNAL outPort : STD_LOGIC;
COMPONENT VHDLDemo
	PORT (
	inPort0 : IN STD_LOGIC;
	inPort1 : IN STD_LOGIC;
	outPort : OUT STD_LOGIC
	);
END COMPONENT;
BEGIN
	i1 : VHDLDemo
	PORT MAP (
-- list connections between master ports and signals
	inPort0 => inPort0,
	inPort1 => inPort1,
	outPort => outPort
	);

-- inPort0
t_prcs_inPort0: PROCESS
BEGIN
	inPort0 <= '0';
	WAIT FOR 60000 ps;
	inPort0 <= '1';
	WAIT FOR 320000 ps;
	inPort0 <= '0';
	WAIT FOR 160000 ps;
	inPort0 <= '1';
	WAIT FOR 200000 ps;
	inPort0 <= '0';
	WAIT FOR 60000 ps;
	inPort0 <= '1';
	WAIT FOR 80000 ps;
	inPort0 <= '0';
WAIT;
END PROCESS t_prcs_inPort0;

-- inPort1
t_prcs_inPort1: PROCESS
BEGIN
	inPort1 <= '0';
	WAIT FOR 40000 ps;
	inPort1 <= '1';
	WAIT FOR 100000 ps;
	inPort1 <= '0';
	WAIT FOR 100000 ps;
	inPort1 <= '1';
	WAIT FOR 120000 ps;
	inPort1 <= '0';
	WAIT FOR 80000 ps;
	inPort1 <= '1';
	WAIT FOR 60000 ps;
	inPort1 <= '0';
	WAIT FOR 40000 ps;
	inPort1 <= '1';
	WAIT FOR 200000 ps;
	inPort1 <= '0';
WAIT;
END PROCESS t_prcs_inPort1;
END VHDLDemo_arch;
