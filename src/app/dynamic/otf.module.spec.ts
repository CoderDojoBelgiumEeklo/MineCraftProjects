import {OTFModule} from './otf.module';

describe('OTFModule', () => {
  let otfmodule: OTFModule;

  beforeEach(() => {
    otfmodule = new OTFModule();
  });

  it('should create an instance', () => {
    expect(OTFModule).toBeTruthy();
  });
});
