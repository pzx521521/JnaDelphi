library testx64;

uses
  SysUtils;

{$R *.res}
function TestString(s: PChar): PChar;stdcall;
begin
  Result :=  PChar(string(s) + 'Delphi≤‚ ‘');
end;

procedure printHello();stdcall;
begin
  Writeln('HelloWorld!');
end;

function add(a, b: Integer ): Integer;stdcall;
begin
  Result := a + b;
end;

function substract(a, b: Integer ): Integer;stdcall;
begin
  Result := a - b;
end;

exports
  add,
  substract,
  printHello,
  TestString;

begin
end.
