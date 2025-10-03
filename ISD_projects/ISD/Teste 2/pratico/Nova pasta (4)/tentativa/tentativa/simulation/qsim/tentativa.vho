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

-- VENDOR "Altera"
-- PROGRAM "Quartus Prime"
-- VERSION "Version 20.1.1 Build 720 11/11/2020 SJ Lite Edition"

-- DATE "11/24/2022 10:43:07"

-- 
-- Device: Altera EP4CE6E22C6 Package TQFP144
-- 

-- 
-- This VHDL file should be used for ModelSim-Altera (VHDL) only
-- 

LIBRARY CYCLONEIVE;
LIBRARY IEEE;
USE CYCLONEIVE.CYCLONEIVE_COMPONENTS.ALL;
USE IEEE.STD_LOGIC_1164.ALL;

ENTITY 	Mux8_1 IS
    PORT (
	\Out\ : OUT std_logic;
	S : IN std_logic_vector(2 DOWNTO 0);
	X : IN std_logic_vector(7 DOWNTO 0);
	GN : IN std_logic
	);
END Mux8_1;

ARCHITECTURE structure OF Mux8_1 IS
SIGNAL gnd : std_logic := '0';
SIGNAL vcc : std_logic := '1';
SIGNAL unknown : std_logic := 'X';
SIGNAL devoe : std_logic := '1';
SIGNAL devclrn : std_logic := '1';
SIGNAL devpor : std_logic := '1';
SIGNAL ww_devoe : std_logic;
SIGNAL ww_devclrn : std_logic;
SIGNAL ww_devpor : std_logic;
SIGNAL \ww_Out\ : std_logic;
SIGNAL ww_S : std_logic_vector(2 DOWNTO 0);
SIGNAL ww_X : std_logic_vector(7 DOWNTO 0);
SIGNAL ww_GN : std_logic;
SIGNAL \Out~output_o\ : std_logic;
SIGNAL \X[5]~input_o\ : std_logic;
SIGNAL \X[4]~input_o\ : std_logic;
SIGNAL \S[0]~input_o\ : std_logic;
SIGNAL \GN~input_o\ : std_logic;
SIGNAL \inst|24~0_combout\ : std_logic;
SIGNAL \S[2]~input_o\ : std_logic;
SIGNAL \X[3]~input_o\ : std_logic;
SIGNAL \X[2]~input_o\ : std_logic;
SIGNAL \inst|23~0_combout\ : std_logic;
SIGNAL \S[1]~input_o\ : std_logic;
SIGNAL \X[1]~input_o\ : std_logic;
SIGNAL \X[0]~input_o\ : std_logic;
SIGNAL \inst|22~0_combout\ : std_logic;
SIGNAL \mux_2_1_2|OR_1~0_combout\ : std_logic;
SIGNAL \X[7]~input_o\ : std_logic;
SIGNAL \X[6]~input_o\ : std_logic;
SIGNAL \inst|25~0_combout\ : std_logic;
SIGNAL \mux_2_1_2|OR_1~1_combout\ : std_logic;

BEGIN

\Out\ <= \ww_Out\;
ww_S <= S;
ww_X <= X;
ww_GN <= GN;
ww_devoe <= devoe;
ww_devclrn <= devclrn;
ww_devpor <= devpor;

\Out~output\ : cycloneive_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \mux_2_1_2|OR_1~1_combout\,
	devoe => ww_devoe,
	o => \Out~output_o\);

\X[5]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_X(5),
	o => \X[5]~input_o\);

\X[4]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_X(4),
	o => \X[4]~input_o\);

\S[0]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_S(0),
	o => \S[0]~input_o\);

\GN~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_GN,
	o => \GN~input_o\);

\inst|24~0\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|24~0_combout\ = (!\GN~input_o\ & ((\S[0]~input_o\ & (\X[5]~input_o\)) # (!\S[0]~input_o\ & ((\X[4]~input_o\)))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0000000010101100",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \X[5]~input_o\,
	datab => \X[4]~input_o\,
	datac => \S[0]~input_o\,
	datad => \GN~input_o\,
	combout => \inst|24~0_combout\);

\S[2]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_S(2),
	o => \S[2]~input_o\);

\X[3]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_X(3),
	o => \X[3]~input_o\);

\X[2]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_X(2),
	o => \X[2]~input_o\);

\inst|23~0\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|23~0_combout\ = (!\GN~input_o\ & ((\S[0]~input_o\ & (\X[3]~input_o\)) # (!\S[0]~input_o\ & ((\X[2]~input_o\)))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0000000010101100",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \X[3]~input_o\,
	datab => \X[2]~input_o\,
	datac => \S[0]~input_o\,
	datad => \GN~input_o\,
	combout => \inst|23~0_combout\);

\S[1]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_S(1),
	o => \S[1]~input_o\);

\X[1]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_X(1),
	o => \X[1]~input_o\);

\X[0]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_X(0),
	o => \X[0]~input_o\);

\inst|22~0\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|22~0_combout\ = (!\GN~input_o\ & ((\S[0]~input_o\ & (\X[1]~input_o\)) # (!\S[0]~input_o\ & ((\X[0]~input_o\)))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0000000010101100",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \X[1]~input_o\,
	datab => \X[0]~input_o\,
	datac => \S[0]~input_o\,
	datad => \GN~input_o\,
	combout => \inst|22~0_combout\);

\mux_2_1_2|OR_1~0\ : cycloneive_lcell_comb
-- Equation(s):
-- \mux_2_1_2|OR_1~0_combout\ = (\S[2]~input_o\ & (((\S[1]~input_o\)))) # (!\S[2]~input_o\ & ((\S[1]~input_o\ & (\inst|23~0_combout\)) # (!\S[1]~input_o\ & ((\inst|22~0_combout\)))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1110010111100000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \S[2]~input_o\,
	datab => \inst|23~0_combout\,
	datac => \S[1]~input_o\,
	datad => \inst|22~0_combout\,
	combout => \mux_2_1_2|OR_1~0_combout\);

\X[7]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_X(7),
	o => \X[7]~input_o\);

\X[6]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_X(6),
	o => \X[6]~input_o\);

\inst|25~0\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|25~0_combout\ = (!\GN~input_o\ & ((\S[0]~input_o\ & (\X[7]~input_o\)) # (!\S[0]~input_o\ & ((\X[6]~input_o\)))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0000000010101100",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \X[7]~input_o\,
	datab => \X[6]~input_o\,
	datac => \S[0]~input_o\,
	datad => \GN~input_o\,
	combout => \inst|25~0_combout\);

\mux_2_1_2|OR_1~1\ : cycloneive_lcell_comb
-- Equation(s):
-- \mux_2_1_2|OR_1~1_combout\ = (\S[2]~input_o\ & ((\mux_2_1_2|OR_1~0_combout\ & ((\inst|25~0_combout\))) # (!\mux_2_1_2|OR_1~0_combout\ & (\inst|24~0_combout\)))) # (!\S[2]~input_o\ & (((\mux_2_1_2|OR_1~0_combout\))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1111100000111000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \inst|24~0_combout\,
	datab => \S[2]~input_o\,
	datac => \mux_2_1_2|OR_1~0_combout\,
	datad => \inst|25~0_combout\,
	combout => \mux_2_1_2|OR_1~1_combout\);

\ww_Out\ <= \Out~output_o\;
END structure;


