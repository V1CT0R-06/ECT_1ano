library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Top-level entity
entity GateDemo is
    port (
        SW   : in  STD_LOGIC_VECTOR(1 downto 0); -- Input switches
        LEDR : out STD_LOGIC_VECTOR(0 downto 0)  -- Output LED
    );
end GateDemo;

-- Architecture for GateDemo
architecture shell of GateDemo is
begin
    -- Instantiate the AND2Gate entity
    system_core: entity work.NAND2Gate(Structural)
        port map (
            inPort0 => SW(0),
            inPort1 => SW(1),
            outPort => LEDR(0)
        );
end shell;

