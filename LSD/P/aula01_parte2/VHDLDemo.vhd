library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Define the top-level entity (MUST match project name)
entity VHDLDemo is
    port (
        inPort0 : in  STD_LOGIC;
        inPort1 : in  STD_LOGIC;
        outPort : out STD_LOGIC
    );
end VHDLDemo;

-- Define the architecture
architecture Behavioral of VHDLDemo is
begin
    outPort <= inPort0 and inPort1; -- Implements a 2-input AND gate
end Behavioral;
