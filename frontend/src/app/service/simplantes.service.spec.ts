import { TestBed } from '@angular/core/testing';

import { SimplantesService } from './simplantes.service';

describe('SimplantesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SimplantesService = TestBed.get(SimplantesService);
    expect(service).toBeTruthy();
  });
});
