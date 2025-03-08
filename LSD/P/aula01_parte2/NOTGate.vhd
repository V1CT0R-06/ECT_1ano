library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity NOTGate is
    port (
        inPort  : in  STD_LOGIC;  -- Input signal
        outPort : out STD_LOGIC   -- Output signal (inverted)
    );
end NOTGate;

architecture Behavioral of NOTGate is
begin
    outPort <= not inPort;
end Behavioral;
