  /*
   * Copyright 2019 RedBridge Technology AB
   *
   * Licensed under the Apache License, Version 2.0 (the "License");
   * you may not use this file except in compliance with the License.
   * You may obtain a copy of the License at
   *
   *     http://www.apache.org/licenses/LICENSE-2.0
   *
   * Unless required by applicable law or agreed to in writing, software
   * distributed under the License is distributed on an "AS IS" BASIS,
   * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   * See the License for the specific language governing permissions and
   * limitations under the License.
   */

  package mp.raptor.server.parser;

  /**
   * Purpose:
   * Parse exception, thrown if an expected servlet is not found from the
   * WebServletAnnotationProcessor.
   *
   * @author Hassan Nazar
   */
  public class AnnotationParseException extends Exception {
    private static final long serialVersionUID = -4234989985006571896L;

    /**
     * Constructor.
     *
     * @param message errormessage.
     */
    public AnnotationParseException(final String message) {
      super(message);
    }
  }
