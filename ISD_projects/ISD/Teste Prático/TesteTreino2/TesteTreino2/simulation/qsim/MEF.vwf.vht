-- Copyright (C) 2020  Intel Corporation. All rights reserved.
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
-- Generated on "01/03/2023 11:50:44"
                                                             
-- Vhdl Test Bench(with test vectors) for design  :          MEF
-- 
-- Simulation tool : 3rd Party
-- 

LIBRARY ieee;                                               
USE ieee.std_logic_1164.all;                                

ENTITY MEF_vhd_vec_tst IS
END MEF_vhd_vec_tst;
ARCHITECTURE MEF_arch OF MEF_vhd_vec_tst IS
-- constants                                                 
-- signals                                                   
SIGNAL CLK : STD_LOGIC;
SIGNAL Q : STD_LOGIC_VECTOR(1 DOWNTO 0);
SIGNAL RESET_H : STD_LOGIC;
SIGNAL X : STD_LOGIC;
SIGNAL Y : STD_LOGIC;
COMPONENT MEF
	PORT (
	CLK : IN STD_LOGIC;
	Q : OUT STD_LOGIC_VECTOR(1 DOWNTO 0);
	RESET_H : IN STD_LOGIC;
	X : IN STD_LOGIC;
	Y : OUT STD_LOGIC
	);
END COMPONENT;
BEGIN
	i1 : MEF
	PORT MAP (
-- list connections between master ports and signals
	CLK => CLK,
	Q => Q,
	RESET_H => RESET_H,
	X => X,
	Y => Y
	);

-- CLK
t_prcs_CLK: PROCESS
BEGIN
LOOP
	CLK <= '0';
	WAIT FOR 25000 ps;
	CLK <= '1';
	WAIT FOR 25000 ps;
	IF (NOW >= 1000000 ps) THEN WAIT; END IF;
END LOOP;
END PROCESS t_prcs_CLK;

-- RESET_H
t_prcs_RESET_H: PROCESS
BEGIN
	RESET_H <= '0';
	WAIT FOR 390000 ps;
	RESET_H <= '1';
	WAIT FOR 180000 ps;
	RESET_H <= '0';
WAIT;
END PROCESS t_prcs_RESET_H;

-- X
t_prcs_X: PROCESS
BEGIN
	X <= '1';
	WAIT FOR 50000 ps;
	X <= '0';
	WAIT FOR 50000 ps;
	X <= '1';
	WAIT FOR 50000 ps;
	X <= '0';
	WAIT FOR 100000 ps;
	X <= '1';
	WAIT FOR 50000 ps;
	X <= '0';
	WAIT FOR 50000 ps;
	X <= '1';
	WAIT FOR 50000 ps;
	X <= '0';
	WAIT FOR 100000 ps;
	X <= '1';
	WAIT FOR 150000 ps;
	X <= '0';
	WAIT FOR 50000 ps;
	X <= '1';
	WAIT FOR 90000 ps;
	X <= '0';
	WAIT FOR 110000 ps;
	X <= '1';
WAIT;
END PROCESS t_prcs_X;
END MEF_arch;
