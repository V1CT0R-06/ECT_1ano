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
-- Generated on "11/24/2022 10:43:06"
                                                             
-- Vhdl Test Bench(with test vectors) for design  :          Mux8_1
-- 
-- Simulation tool : 3rd Party
-- 

LIBRARY ieee;                                               
USE ieee.std_logic_1164.all;                                

ENTITY Mux8_1_vhd_vec_tst IS
END Mux8_1_vhd_vec_tst;
ARCHITECTURE Mux8_1_arch OF Mux8_1_vhd_vec_tst IS
-- constants                                                 
-- signals                                                   
SIGNAL GN : STD_LOGIC;
SIGNAL Out : STD_LOGIC;
SIGNAL S : STD_LOGIC_VECTOR(2 DOWNTO 0);
SIGNAL X : STD_LOGIC_VECTOR(7 DOWNTO 0);
COMPONENT Mux8_1
	PORT (
	GN : IN STD_LOGIC;
	\Out\ : OUT STD_LOGIC;
	S : IN STD_LOGIC_VECTOR(2 DOWNTO 0);
	X : IN STD_LOGIC_VECTOR(7 DOWNTO 0)
	);
END COMPONENT;
BEGIN
	i1 : Mux8_1
	PORT MAP (
-- list connections between master ports and signals
	GN => GN,
	\Out\ => Out,
	S => S,
	X => X
	);

-- GN
t_prcs_GN: PROCESS
BEGIN
	GN <= '0';
WAIT;
END PROCESS t_prcs_GN;
-- S[2]
t_prcs_S_2: PROCESS
BEGIN
	S(2) <= '0';
	WAIT FOR 400000 ps;
	S(2) <= '1';
	WAIT FOR 400000 ps;
	S(2) <= '0';
WAIT;
END PROCESS t_prcs_S_2;
-- S[1]
t_prcs_S_1: PROCESS
BEGIN
	FOR i IN 1 TO 2
	LOOP
		S(1) <= '0';
		WAIT FOR 200000 ps;
		S(1) <= '1';
		WAIT FOR 200000 ps;
	END LOOP;
	S(1) <= '0';
WAIT;
END PROCESS t_prcs_S_1;
-- S[0]
t_prcs_S_0: PROCESS
BEGIN
LOOP
	S(0) <= '0';
	WAIT FOR 100000 ps;
	S(0) <= '1';
	WAIT FOR 100000 ps;
	IF (NOW >= 1000000 ps) THEN WAIT; END IF;
END LOOP;
END PROCESS t_prcs_S_0;
-- X[7]
t_prcs_X_7: PROCESS
BEGIN
	X(7) <= '0';
WAIT;
END PROCESS t_prcs_X_7;
-- X[6]
t_prcs_X_6: PROCESS
BEGIN
	X(6) <= '0';
WAIT;
END PROCESS t_prcs_X_6;
-- X[5]
t_prcs_X_5: PROCESS
BEGIN
	X(5) <= '0';
WAIT;
END PROCESS t_prcs_X_5;
-- X[4]
t_prcs_X_4: PROCESS
BEGIN
	X(4) <= '0';
WAIT;
END PROCESS t_prcs_X_4;
-- X[3]
t_prcs_X_3: PROCESS
BEGIN
	X(3) <= '0';
WAIT;
END PROCESS t_prcs_X_3;
-- X[2]
t_prcs_X_2: PROCESS
BEGIN
	X(2) <= '0';
WAIT;
END PROCESS t_prcs_X_2;
-- X[1]
t_prcs_X_1: PROCESS
BEGIN
	X(1) <= '0';
WAIT;
END PROCESS t_prcs_X_1;
-- X[0]
t_prcs_X_0: PROCESS
BEGIN
	X(0) <= '0';
WAIT;
END PROCESS t_prcs_X_0;
END Mux8_1_arch;
