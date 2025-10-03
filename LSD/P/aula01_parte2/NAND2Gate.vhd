library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity NAND2Gate is
    port (
        inPort0 : in  STD_LOGIC;
        inPort1 : in  STD_LOGIC;
        outPort : out STD_LOGIC
    );
end NAND2Gate;

architecture Structural of NAND2Gate is
    signal s_andout : STD_LOGIC; -- Intermediate signal
begin
    -- Instantiate AND2Gate (AND function)
    and_gate: entity work.VHDLDemo(Behavioral)
        port map (
            inPort0 => inPort0,
            inPort1 => inPort1,
            outPort => s_andout
        );

    -- Instantiate NOTGate (Inversion)
    not_gate: entity work.NOTGate(Behavioral)
        port map (
            inPort  => s_andout,
            outPort => outPort
        );
end Structural;
